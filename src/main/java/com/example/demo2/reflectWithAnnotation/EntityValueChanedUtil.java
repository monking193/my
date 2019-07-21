package com.example.demo2.reflectWithAnnotation;



import org.apache.commons.lang.StringUtils;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;

public class EntityValueChanedUtil<T> {
    public static final HashMap<String,Object> data = new HashMap<>();

    static {
        HashMap<String,String> nameDict = new HashMap<>();
        nameDict.put("du","都市");
        nameDict.put("li","歷史");

        HashMap<String,String> addressDict = new HashMap<>();
        addressDict.put("1","帝都");
        addressDict.put("2","魔都");

        data.put("nameType",nameDict);
        data.put("address",addressDict);
    }

    public String contrastObj(Object oldBean, Object newBean) {
        String str = "";
        T pojo1 = (T) oldBean;
        T pojo2 = (T) newBean;
        try {
            Class clazz = pojo1.getClass();
            Field[] fields = pojo1.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                if("serialVersionUID".equals(field.getName())){
                    continue;
                }
                PropertyDescriptor pd = new PropertyDescriptor(field.getName(), clazz);
                Method getMethod = pd.getReadMethod();
                Object o1 = getMethod.invoke(pojo1);
                Object o2 = getMethod.invoke(pojo2);
                if(o1==null || o2 == null){
                    continue;
                }
                StudentAnnooation studentAnnooation = field.getAnnotation(StudentAnnooation.class);
                String fieldName = "";
                String dictName = "";
                if(studentAnnooation != null){
                    fieldName =  studentAnnooation.columnName();
                    dictName = studentAnnooation.dictionaryType();
                }
                HashMap<String,String> dict = new HashMap<>();
                if(StringUtils.isNotEmpty(dictName)){
                    dict = (HashMap<String, String>) data.get(dictName);
                    System.out.print("字典值：" + dict.get(o1) + " ----" + dict.get(o2));
                }
                if (!o1.toString().equals(o2.toString())) {
                    System.out.println("字段名称" + field.getName() + " 中文名稱: "+ fieldName
                            + ",旧值:"+o1+",新值:"+o2);

                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return str;
    }
}
