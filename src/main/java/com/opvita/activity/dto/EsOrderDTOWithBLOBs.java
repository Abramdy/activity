package com.opvita.activity.dto;

public class EsOrderDTOWithBLOBs extends EsOrderDTO {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.ES_ORDER.GOODS
     *
     * @mbggenerated
     */
    private String goods;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column CULSITE.ES_ORDER.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.ES_ORDER.GOODS
     *
     * @return the value of CULSITE.ES_ORDER.GOODS
     *
     * @mbggenerated
     */
    public String getGoods() {
        return goods;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.ES_ORDER.GOODS
     *
     * @param goods the value for CULSITE.ES_ORDER.GOODS
     *
     * @mbggenerated
     */
    public void setGoods(String goods) {
        this.goods = goods == null ? null : goods.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column CULSITE.ES_ORDER.REMARK
     *
     * @return the value of CULSITE.ES_ORDER.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column CULSITE.ES_ORDER.REMARK
     *
     * @param remark the value for CULSITE.ES_ORDER.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}