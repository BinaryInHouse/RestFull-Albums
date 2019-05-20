package net.ameregildo.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ameregildo.api.entity.Album;

public interface AlbumsRepository extends JpaRepository<Album, Integer> {

}
