package com.app.linkedin.repositories;

import com.app.linkedin.models.entities.Company;
import com.app.linkedin.models.entities.Member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SearchRepository {
    private Map<String, List<Member>> membersMap = new HashMap<>();
    private Map<String, List<Company>> companyMap = new HashMap<>();

    public List<Member> searchMemberByName(String memberName) {
        return membersMap.getOrDefault(memberName, new ArrayList<>());
    }

    public List<Company> searchCompanyByName(String companyName) {
        return companyMap.getOrDefault(companyName, new ArrayList<>());
    }
}
