package net.ameregildo.api.service;

import java.util.List;

import net.ameregildo.api.entity.Album;

public interface IAlbumsService {
	
	List<Album> buscarTodos();
	void guardar(Album album);
	void eliminar(int idAlbum);

}
