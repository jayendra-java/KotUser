package com.KOT.KOTOrganization.Service;

import com.KOT.KOTOrganization.Model.KotUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KotUserService extends JpaRepository<KotUser,Integer> {
}
