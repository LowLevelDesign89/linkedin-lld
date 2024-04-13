package com.app.linkedin.services;

import com.app.linkedin.models.entities.Company;
import com.app.linkedin.models.entities.Member;

import java.util.List;

public interface SearchService {
    List<Member> searchMemberByName(String memberName);
    List<Company> searchCompanyByName(String companyName);
}
