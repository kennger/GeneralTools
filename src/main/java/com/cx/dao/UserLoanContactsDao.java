package com.cx.dao;

import com.cx.pojo.UserLoanContacts;
import com.cx.pojo.UserLoanContactsExample;

import java.util.List;

public interface UserLoanContactsDao {
    /**
     *
     * @mbggenerated 2019-03-29
     */
    int countByExample(UserLoanContactsExample example);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    int insert(UserLoanContacts record);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    int insertSelective(UserLoanContacts record);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    List<UserLoanContacts> selectByExampleWithBLOBs(UserLoanContactsExample example);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    List<UserLoanContacts> selectByExample(UserLoanContactsExample example);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    UserLoanContacts selectByPrimaryKey(Integer id);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    int updateByPrimaryKeySelective(UserLoanContacts record);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    int updateByPrimaryKeyWithBLOBs(UserLoanContacts record);

    /**
     *
     * @mbggenerated 2019-03-29
     */
    int updateByPrimaryKey(UserLoanContacts record);

    List<String> getAllPhone();

    List<String> getAllUserId();

    String getContactsByUserId(String userId);

    String getPhoneByUserId(String userId);

    String getUserIdByPhone(String phone);

    int selectByPhone(String phone);
}