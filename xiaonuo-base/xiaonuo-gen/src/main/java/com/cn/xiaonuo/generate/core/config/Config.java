package com.cn.xiaonuo.generate.core.config;


/**
 * 代码生成配置
 *
 * @author yubaoshan
 * @date 2020-12-19 02:30:56
 */
public class Config {

    /**
     * 存放vm模板位置
     */
    public static String templatePath = "template/";

    /**
     * 主键标识
     */
    public static String DB_TABLE_COM_KRY = "PRI";

    /**
     * 模块名（一般为modular，无特殊要求一般不改）
     */
    public static String MODULAR_NAME = "modular";

    /**
     * 本项目生成时是否覆盖
     */
    public static final boolean FLAG = false;

    /**
     * 大模块名称（生成到代码中哪个模块下）
     */
    public static String BASE_MODULAR_NAME = "xiaonuo-main";

    /**
     * java文件夹
     */
    public static String BASE_JAVA_PAHT = "\\src\\main\\java\\";

    /**
     * vue文件夹
     */
    public static String BASE_VUE_PAHT = "\\_web\\src\\";

    /**
     * 代码生成路径
     */
    public static String controllerPath;
    public static String entityPath;
    public static String enumsPath;
    public static String mapperPath;
    public static String mappingPath;
    public static String paramPath;
    public static String servicePath;
    public static String serviceImplPath;
    public static String manageJsPath;
    public static String vueIndexPath;
    public static String vueAddFromPath;
    public static String vueEditFromPath;

    /**
     * 各个代码存放路径文件夹
     */
    public static String[] xnCodeGenFilePath (String busName, String packageName, String className) {
        String packageNameString = packageName.replace(".",File.separator) + File.separator;
        controllerPath = BASE_JAVA_PAHT + packageNameString + MODULAR_NAME + File.separator + busName + File.separator + "controller" + File.separator;
        entityPath = BASE_JAVA_PAHT + packageNameString + MODULAR_NAME + File.separator + busName + File.separator + "entity" + File.separator;
        enumsPath = BASE_JAVA_PAHT+ packageNameString  + MODULAR_NAME + File.separator + busName + File.separator + "enums" + File.separator;
        mapperPath = BASE_JAVA_PAHT + packageNameString  + MODULAR_NAME + File.separator + busName + File.separator + "mapper" + File.separator;
        mappingPath = mapperPath + File.separator + "mapping" + File.separator;
        paramPath = BASE_JAVA_PAHT+ File.separator + packageNameString  + MODULAR_NAME + File.separator + busName + File.separator + "param" + File.separator;
        servicePath = BASE_JAVA_PAHT+ File.separator + packageNameString  + MODULAR_NAME + File.separator + busName + File.separator + "service" + File.separator;
        serviceImplPath = servicePath + File.separator + "impl" + File.separator;
        manageJsPath = BASE_VUE_PAHT + File.separator + "api" + File.separator + MODULAR_NAME + File.separator + "main" + File.separator + busName + File.separator;
        vueIndexPath = BASE_VUE_PAHT + File.separator + "views" + File.separator +  "main" + File.separator + busName + File.separator + StrUtil.lowerFirst(className)  + File.separator;
        vueAddFromPath = BASE_VUE_PAHT + File.separator + "views" + File.separator +  "main" + File.separator + busName + File.separator + StrUtil.lowerFirst(className) + File.separator;
        vueEditFromPath = BASE_VUE_PAHT + File.separator + "views" + File.separator +  "main" + File.separator + busName + File.separator + StrUtil.lowerFirst(className) + File.separator;
        return new String[] {
                controllerPath, entityPath, enumsPath, mapperPath, mappingPath, paramPath, servicePath, serviceImplPath, manageJsPath, vueIndexPath, vueAddFromPath, vueEditFromPath
        };
    }

    /**
     * 模板文件
     */
    public static String[] xnCodeGenTempFile = {
            "Controller.java.vm",
            "entity.java.vm",
            "ExceptionEnum.java.vm",
            "Mapper.java.vm",
            "Mapper.xml.vm",
            "Param.java.vm",
            "Service.java.vm",
            "ServiceImpl.java.vm",
            "Manage.js.vm",
            "index.vue.vm",
            "addForm.vue.vm",
            "editForm.vue.vm",
    };

    /**
     * 本地项目根目录
     */
    public static String getLocalPath () {
        return System.getProperty("user.dir") + "\\" + BASE_MODULAR_NAME + "\\";
    }

    /**
     * vue前端
     */
    public static String getLocalFrontPath () {
        return System.getProperty("user.dir") + "\\" ;
    }
}
