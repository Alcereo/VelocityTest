package ru.alcereo;

/**
 * Created by alcereo on 20.05.17.
 */
public class AttributeData {

    private String type;
    private String name;
    private String nameAppCase;
    private String tableName;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameAppCase() {
        return nameAppCase;
    }

    public void setNameAppCase(String nameAppCase) {
        this.nameAppCase = nameAppCase;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public AttributeData(String type, String name, String nameAppCase, String tableName) {

        this.type = type;
        this.name = name;
        this.nameAppCase = nameAppCase;
        this.tableName = tableName;

    }
}
