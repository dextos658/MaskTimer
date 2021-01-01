package si.facemask.catalog.imagecatalog.models.entities;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "image_metadata")
@NamedQueries(value =
        {
                @NamedQuery(name = "ImageMetadataEntity.getAll",
                        query = "SELECT im FROM ImageMetadataEntity im")
        })
public class ImageMetadataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer maskId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "color")
    private String color;

    @Column(name = "material")
    private String material;

    @Column(name = "created")
    private Instant created;

    @Column(name = "instock")
    private Integer instock;

    @Column(name = "price")
    private Integer price;

    @Column(name = "uri")
    private String uri;

    public Integer getMaskId() {
        return maskId;
    }

    public void setMaskId(Integer maskId) {
        this.maskId = maskId;
    }

    public void setId(Integer id) {
        this.maskId = maskId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.color = material;
    }


    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getInstock() {
        return instock;
    }

    public void setInstock(Integer instock) {
        this.instock = instock;
    }



    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }
}