package org.domeos.framework.api.mapper.alarm.portal;

import org.apache.ibatis.annotations.*;
import org.domeos.framework.api.model.alarm.falcon.portal.Action;
import org.springframework.stereotype.Repository;

/**
 * Created by baokangwang on 2016/4/14.
 */
@Repository
public interface PortalActionMapper {

    @Insert("INSERT INTO portal.action (uic, url, callback, before_callback_sms, before_callback_mail, after_callback_sms, " +
            "after_callback_mail) VALUES (#{uic}, #{url}, #{callback}, #{before_callback_sms}, #{before_callback_mail}, " +
            " #{after_callback_sms}, #{after_callback_mail})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    int insertAction(Action action);

    @Delete("DELETE FROM portal.action WHERE id=#{id}")
    int deleteActionById(@Param("id") long id);

    @Select("SELECT * FROM portal.action WHERE id=#{id}")
    Action getActionById(@Param("id") long id);
}
