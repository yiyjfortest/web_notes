package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Paramter;
import po.ParamterExample;

public interface ParamterMapper {
    int countByExample(ParamterExample example);

    int deleteByExample(ParamterExample example);

    int deleteByPrimaryKey(Integer paramterId);

    int insert(Paramter record);

    int insertSelective(Paramter record);

    List<Paramter> selectByExample(ParamterExample example);

    Paramter selectByPrimaryKey(Integer paramterId);

    int updateByExampleSelective(@Param("record") Paramter record, @Param("example") ParamterExample example);

    int updateByExample(@Param("record") Paramter record, @Param("example") ParamterExample example);

    int updateByPrimaryKeySelective(Paramter record);

    int updateByPrimaryKey(Paramter record);
}