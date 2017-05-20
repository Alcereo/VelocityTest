package ru.alcereo;

import java.util.List;

/**
 * Created by alcereo on 20.05.17.
 */
public class EntityData {

    private String tableName;
    private String className;
    private List<AttributeData> attributeList;
    private AttributeData identifier;

    public AttributeData getIdentifier() {
        return identifier;
    }

    public void setIdentifier(AttributeData identifier) {
        this.identifier = identifier;
    }

    public EntityData(String tableName, String className, List<AttributeData> attributeList, AttributeData identifier) {
        this.tableName = tableName;
        this.className = className;
        this.attributeList = attributeList;
        this.identifier = identifier;

    }

    public List<AttributeData> getAttributeList() {
        return attributeList;
    }

    public void setAttributeList(List<AttributeData> attributeList) {
        this.attributeList = attributeList;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}
