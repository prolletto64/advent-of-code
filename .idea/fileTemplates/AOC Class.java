#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
public class ${NAME} {
    private static String[] lines = readLines("${NAME}");
    public static void run(){
        
    }
}
