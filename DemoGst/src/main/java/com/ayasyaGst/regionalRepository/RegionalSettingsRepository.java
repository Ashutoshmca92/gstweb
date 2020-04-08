package com.ayasyaGst.regionalRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ayasyaGst.regionalsettings.RegionalSettings;

@Repository
public interface RegionalSettingsRepository extends JpaRepository<RegionalSettings, Long> {

}
