package dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import po.Notes;
import po.NotesExample;

public interface NotesMapper {
    int countByExample(NotesExample example);

    int deleteByExample(NotesExample example);

    int deleteByPrimaryKey(String notesId);

    int insert(Notes record);

    int insertSelective(Notes record);

    List<Notes> selectByExample(NotesExample example);

    Notes selectByPrimaryKey(String notesId);

    int updateByExampleSelective(@Param("record") Notes record, @Param("example") NotesExample example);

    int updateByExample(@Param("record") Notes record, @Param("example") NotesExample example);

    int updateByPrimaryKeySelective(Notes record);

    int updateByPrimaryKey(Notes record);
}