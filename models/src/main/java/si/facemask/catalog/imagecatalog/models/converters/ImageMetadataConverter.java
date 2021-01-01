package si.facemask.catalog.imagecatalog.models.converters;

import si.facemask.catalog.imagecatalog.lib.ImageMetadata;
import si.facemask.catalog.imagecatalog.models.entities.ImageMetadataEntity;

public class ImageMetadataConverter {

    public static ImageMetadata toDto(ImageMetadataEntity entity) {

        ImageMetadata dto = new ImageMetadata();
        dto.setMaskId(entity.getMaskId());
        dto.setTitle(entity.getTitle());
        dto.setDescription(entity.getDescription());
        dto.setColor(entity.getColor());
        dto.setMaterial(entity.getMaterial());
        dto.setPrice(entity.getPrice());
        dto.setInstock(entity.getInstock());
        dto.setCreated(entity.getCreated());
        dto.setUri(entity.getUri());

        return dto;

    }

    public static ImageMetadataEntity toEntity(ImageMetadata dto) {

        ImageMetadataEntity entity = new ImageMetadataEntity();
        entity.setMaskId(dto.getMaskId());
        entity.setTitle(dto.getTitle());
        entity.setDescription(dto.getDescription());
        entity.setColor(dto.getColor());
        entity.setMaterial(dto.getMaterial());
        entity.setPrice(dto.getPrice());
        entity.setInstock(dto.getInstock());
        entity.setUri(dto.getUri());

        return entity;

    }

}
