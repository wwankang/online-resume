package top.wankang.onlineresume.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import top.wankang.onlineresume.entity.Skill;
import top.wankang.onlineresume.entity.SkillExample;

@Repository
public interface SkillMapper {
    long countByExample(SkillExample example);

    int deleteByExample(SkillExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Skill record);

    int insertSelective(Skill record);

    List<Skill> selectByExample(SkillExample example);

    Skill selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByExample(@Param("record") Skill record, @Param("example") SkillExample example);

    int updateByPrimaryKeySelective(Skill record);

    int updateByPrimaryKey(Skill record);
}