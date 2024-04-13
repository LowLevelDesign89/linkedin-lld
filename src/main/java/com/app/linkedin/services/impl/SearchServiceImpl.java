package com.app.linkedin.services.impl;

import com.app.linkedin.models.entities.Company;
import com.app.linkedin.models.entities.Member;
import com.app.linkedin.repositories.SearchRepository;
import com.app.linkedin.services.SearchService;

import java.util.List;

public class SearchServiceImpl implements SearchService {
    private SearchRepository searchRepository;

    public SearchServiceImpl(SearchRepository searchRepository) {
        this.searchRepository = searchRepository;
    }

    @Override
    public List<Member> searchMemberByName(String memberName) {
        return searchRepository.searchMemberByName(memberName);
    }

    @Override
    public List<Company> searchCompanyByName(String companyName) {
        return searchRepository.searchCompanyByName(companyName);
    }
}
