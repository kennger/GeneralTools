package com.cx.service.services;

import com.cx.dao.UserLoanContactsDao;
import com.cx.pojo.UserLoanContacts;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

@Service("callRecordService")
public class CallRecordService {

    @Resource
    private UserLoanContactsDao userLoanContactsDao;

    public List<String> getUserLoanId(){

        return userLoanContactsDao.getAllUserId();
    }

    public List<String> getContactsLoanTelephone(String userId) {

        List<String> listOfContactsLoanTelephone = new ArrayList<>();
        try {
            if (userId != null) {
                String contacts = userLoanContactsDao.getContactsByUserId(userId);
                String phone = userLoanContactsDao.getPhoneByUserId(userId);
                List<String> listOfPhone = userLoanContactsDao.getAllPhone();
                String[] contactList = contacts.split(",");
                if (contactList.length > 0) {
                    for (int i = 0; i < contactList.length; i++) {
                        if (listOfPhone.toString().contains(contactList[i])
                                && contactList[i].length() == 11
                                && !contactList[i].equals(phone)) {
                            listOfContactsLoanTelephone.add(contactList[i]);
                        }
                    }
                }

//                  if(contactList.length>0){
//                      for(int i=0;i<contactList.length;i++){
//                          int userLoanContacts = userLoanContactsDao.selectByPhone(contactList[i]);
//                          if(userLoanContacts>0&&!phone.equals(contactList[i])){
//                              listOfContactsLoanTelephone.add(contactList[i]);
//                          }
//                      }
//                  }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return removeDuplicate(listOfContactsLoanTelephone);
    }

    private static List<String> removeDuplicate(List<String> list) {
        HashSet h = new HashSet(list);
        list.clear();
        list.addAll(h);
        return list;
    }

}
