package net.ameregildo.api.service.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ameregildo.api.entity.Album;
import net.ameregildo.api.repository.AlbumsRepository;
import net.ameregildo.api.service.IAlbumsService;

@Service
public class AlbumsService implements IAlbumsService {

	@Autowired
	private AlbumsRepository repoAlbums;
	
	
	public List<Album> buscarTodos() {
		
		return repoAlbums.findAll();
	}


	@Override
	public void guardar(Album album) {
		repoAlbums.save(album);
		
	}


	@Override
	public void eliminar(int idAlbum) {
		repoAlbums.deleteById(idAlbum);
		
	}

}
