package data_mahasiswa.lilis_sonia_18090051.repo;

import data_mahasiswa.lilis_sonia_18090051.entity.DataMhs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMhsRepo extends JpaRepository<DataMhs, String> {
}