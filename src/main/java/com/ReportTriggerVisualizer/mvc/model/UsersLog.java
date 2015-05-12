package com.ReportTriggerVisualizer.mvc.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class UsersLog {

    @Id
    @Column(name="Prim")
    private int prim;

    @Column(name="changes")
    private String changes;

    @Column(name="action")
    private String action;

    @Column(name="DateTime1")
    private String dateTime;

    @Column(name="mt4_login")
    private Long userLogin;

    @Column(name="NEW_mt4_user_ID")
    private String newUserID;

    @Column(name="NEW_mt4_user_group")
    private String newUserGroup;

    @Column(name="NEW_mt4_user_name")
    private String newUserName;

    @Column(name="NEW_mt4_user_email")
    private String newUserEmail;

    @Column(name="NEW_mt4_user_state")
    private String newUserState;

    @Column(name="NEW_mt4_user_comment")
    private String newUserComment;

    @Column(name="NEW_mt4_user_agent_account")
    private Long newUserAgentAccount;

    @Column(name="OLD_mt4_user_ID")
    private String oldUserID;

    @Column(name="OLD_mt4_user_group")
    private String oldUserGroup;

    @Column(name="OLD_mt4_user_name")
    private String oldUserName;

    @Column(name="OLD_mt4_user_email")
    private String oldUserEmail;

    @Column(name="OLD_mt4_user_state")
    private String oldUserState;

    @Column(name="OLD_mt4_user_comment")
    private String oldUserComment;

    @Column(name="OLD_mt4_user_agent_account")
    private Long oldUserAgentAccount;

    public int getPrim() {
        return prim;
    }

    public void setPrim(int prim) {
        this.prim = prim;
    }

    public String getChanges() {
        return changes;
    }

    public void setChanges(String changes) {
        this.changes = changes;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    public Long getUserLogin() {
        return userLogin;
    }

    public void setUserLogin(Long userLogin) {
        this.userLogin = userLogin;
    }

    public String getNewUserID() {
        return newUserID;
    }

    public void setNewUserID(String newUserID) {
        this.newUserID = newUserID;
    }

    public String getNewUserGroup() {
        return newUserGroup;
    }

    public void setNewUserGroup(String newUserGroup) {
        this.newUserGroup = newUserGroup;
    }

    public String getNewUserName() {
        return newUserName;
    }

    public void setNewUserName(String newUserName) {
        this.newUserName = newUserName;
    }

    public String getNewUserEmail() {
        return newUserEmail;
    }

    public void setNewUserEmail(String newUserEmail) {
        this.newUserEmail = newUserEmail;
    }

    public String getNewUserState() {
        return newUserState;
    }

    public void setNewUserState(String newUserState) {
        this.newUserState = newUserState;
    }

    public String getNewUserComment() {
        return newUserComment;
    }

    public void setNewUserComment(String newUserComment) {
        this.newUserComment = newUserComment;
    }

    public Long getNewUserAgentAccount() {
        return newUserAgentAccount;
    }

    public void setNewUserAgentAccount(Long newUserAgentAccount) {
        this.newUserAgentAccount = newUserAgentAccount;
    }

    public String getOldUserID() {
        return oldUserID;
    }

    public void setOldUserID(String oldUserID) {
        this.oldUserID = oldUserID;
    }

    public String getOldUserGroup() {
        return oldUserGroup;
    }

    public void setOldUserGroup(String oldUserGroup) {
        this.oldUserGroup = oldUserGroup;
    }

    public String getOldUserName() {
        return oldUserName;
    }

    public void setOldUserName(String oldUserName) {
        this.oldUserName = oldUserName;
    }

    public String getOldUserEmail() {
        return oldUserEmail;
    }

    public void setOldUserEmail(String oldUserEmail) {
        this.oldUserEmail = oldUserEmail;
    }

    public String getOldUserState() {
        return oldUserState;
    }

    public void setOldUserState(String oldUserState) {
        this.oldUserState = oldUserState;
    }

    public String getOldUserComment() {
        return oldUserComment;
    }

    public void setOldUserComment(String oldUserComment) {
        this.oldUserComment = oldUserComment;
    }

    public Long getOldUserAgentAccount() {
        return oldUserAgentAccount;
    }

    public void setOldUserAgentAccount(Long oldUserAgentAccount) {
        this.oldUserAgentAccount = oldUserAgentAccount;
    }
}
