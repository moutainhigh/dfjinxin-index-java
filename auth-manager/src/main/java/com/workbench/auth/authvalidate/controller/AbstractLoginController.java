package com.workbench.auth.authvalidate.controller;

import com.webapp.support.session.SessionSupport;
import com.workbench.shiro.WorkbenchShiroUtils;

/**
 * Created by SongCQ on 2018/10/23.
 */
public abstract class AbstractLoginController {

    public final Object getLoginUserInfo(){
        Object user = WorkbenchShiroUtils.checkUserFromShiroContext();
        return user;
    }

}
