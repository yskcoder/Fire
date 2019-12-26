package cn.yskcoder.fire.model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Table(name = "`sys_role_org`")
public class SysRoleOrg {
    private Long roleOrgId;

    private Long roleId;

    private Long orgId;

    private LocalDateTime createTime;

    public Long getRoleOrgId() {
        return roleOrgId;
    }

    public void setRoleOrgId(Long roleOrgId) {
        this.roleOrgId = roleOrgId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }
}