package mybatis;

import org.apache.ibatis.annotations.Param;

/**
 * Created by james on 2019/9/12.
 */
public interface UserMapper {

    User getUser(@Param("id") Integer id);

}
