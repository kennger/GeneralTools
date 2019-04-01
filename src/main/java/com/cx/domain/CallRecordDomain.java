package com.cx.domain;

import java.util.List;

public interface CallRecordDomain {

    List<String> getUserLoanId();

    List<String> getContactsLoanTelephone(String userId);

}
