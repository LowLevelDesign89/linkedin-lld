package com.app.linkedin.controllers;

import com.app.linkedin.models.entities.Company;
import com.app.linkedin.models.entities.Member;
import com.app.linkedin.services.SearchService;

import java.util.List;

public class SearchController {
    private SearchService searchService;

    public SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    public List<Company> searchByCompanyName(String companyName) {
        return searchService.searchCompanyByName(companyName);
    }

    public List<Member> searchByMemberName(String memberName) {
        return searchService.searchMemberByName(memberName);
    }
}
