package com.opvita.activity.dao;

import com.opvita.activity.dto.MSaleProductDTO;
import com.opvita.activity.dto.MSaleProductDTOCriteria;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MSaleProductDTOMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int countByExample(MSaleProductDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int deleteByExample(MSaleProductDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int insert(MSaleProductDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int insertSelective(MSaleProductDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    List<MSaleProductDTO> selectByExample(MSaleProductDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    MSaleProductDTO selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") MSaleProductDTO record, @Param("example") MSaleProductDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") MSaleProductDTO record, @Param("example") MSaleProductDTOCriteria example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(MSaleProductDTO record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table M_SALE_PRODUCT
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(MSaleProductDTO record);
}