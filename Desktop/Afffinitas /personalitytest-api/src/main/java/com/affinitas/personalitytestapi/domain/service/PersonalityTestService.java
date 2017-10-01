package com.affinitas.personalitytestapi.domain.service;

import java.util.List;

import com.affinitas.personalitytestapi.dto.SelectedData;

public interface PersonalityTestService {
	public void saveTest(List<Object> selections, String email);
}
