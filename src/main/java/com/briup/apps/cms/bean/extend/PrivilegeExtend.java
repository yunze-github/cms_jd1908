package com.briup.apps.cms.bean.extend;

import com.briup.apps.cms.bean.Privilege;

import java.util.List;

public class PrivilegeExtend extends Privilege {
    private List<PrivilegeExtend> privilegeExtends;

    public List<PrivilegeExtend> getPrivilegeExtends() {
        return privilegeExtends;
    }

    public void setPrivilegeExtends(List<PrivilegeExtend> privilegeExtends) {
        this.privilegeExtends = privilegeExtends;
    }
}
