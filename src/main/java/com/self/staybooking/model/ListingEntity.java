package com.self.staybooking.model;

import jakarta.persistence.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.locationtech.jts.geom.Point;


import java.util.List;
import java.util.Objects;


@Entity
@Table(name = "listings")
public class ListingEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "host_id")
    private Long hostId;
    private String name;
    private String address;
    private String description;
    private Integer guestNumber;
    private List<String> imageUrls;
    private Point location;


    @ManyToOne
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "host_id", foreignKey = @ForeignKey(name = "fk_listing_host"), insertable = false, updatable = false)
    private UserEntity host;


    public ListingEntity() {
    }


    public ListingEntity(Long id, Long hostId, String name, String address, String description, Integer guestNumber, List<String> imageUrls, Point location
    ) {
        this.id = id;
        this.hostId = hostId;
        this.name = name;
        this.description = description;
        this.address = address;
        this.guestNumber = guestNumber;
        this.imageUrls = imageUrls;
        this.location = location;
    }


    public Long getId() {
        return id;
    }


    public Long getHostId() {
        return hostId;
    }


    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public String getAddress() {
        return address;
    }


    public Integer getGuestNumber() {
        return guestNumber;
    }


    public List<String> getImageUrls() {
        return imageUrls;
    }
}