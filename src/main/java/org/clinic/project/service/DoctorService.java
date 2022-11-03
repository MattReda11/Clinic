package org.clinic.project.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.clinic.project.dao.DoctorRepository;
import org.clinic.project.model.Doctor;

@Service
@Transactional
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepo;

    // READ ALL
    public List<Doctor> findAll() {
        return doctorRepo.findAll();
    }

    // READ BY ID
    public Doctor get(int doctorID) {
        return doctorRepo.findById(doctorID).get();
    }

    // CREATE
    public void save(Doctor doctor) {
        doctorRepo.save(doctor);
    }

    // DELETE
    public void delete(int doctorID) {
        doctorRepo.deleteById(doctorID);
    }
}
