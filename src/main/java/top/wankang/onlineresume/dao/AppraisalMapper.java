package top.wankang.onlineresume.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wankang.onlineresume.entity.Appraisal;
import top.wankang.onlineresume.entity.AppraisalExample;
@Repository
public interface AppraisalMapper {
    long countByExample(AppraisalExample example);

    int deleteByExample(AppraisalExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Appraisal record);

    int insertSelective(Appraisal record);

    List<Appraisal> selectByExample(AppraisalExample example);

    Appraisal selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Appraisal record, @Param("example") AppraisalExample example);

    int updateByExample(@Param("record") Appraisal record, @Param("example") AppraisalExample example);

    int updateByPrimaryKeySelective(Appraisal record);

    int updateByPrimaryKey(Appraisal record);
}