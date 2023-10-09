package model.other;

import java.math.BigDecimal;

public class Kindergarten {
    private String nameKindergarten;
    private String groupNumber;
    private String teacherName;
    private Integer maxNumberOfChildren;
    private Integer quantityChildren;
    private int ageGroup;
    private BigDecimal minthlyPaymentforOne;

    public String getNameKindergarten() {
        return nameKindergarten;
    }

    public void setNameKindergarten(String nameKindergarten) {
        this.nameKindergarten = nameKindergarten;
    }

    public String getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public Integer getMaxNumberOfChildren() {
        return maxNumberOfChildren;
    }

    public void setMaxNumberOfChildren(Integer maxNumberOfChildren) {
        this.maxNumberOfChildren = maxNumberOfChildren;
    }

    public Integer getQuantityChildren() {
        return quantityChildren;
    }

    public void setQuantityChildren(Integer quantityChildren) {
        this.quantityChildren = quantityChildren;
    }

    public int getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(int ageGroup) {
        this.ageGroup = ageGroup;
    }

    public BigDecimal getMinthlyPaymentforOne() {
        return minthlyPaymentforOne;
    }

    public void setMinthlyPaymentforOne(BigDecimal minthlyPaymentforOne) {
        this.minthlyPaymentforOne = minthlyPaymentforOne;
    }
}
