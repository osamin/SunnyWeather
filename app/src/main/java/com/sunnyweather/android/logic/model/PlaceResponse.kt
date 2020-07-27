package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

class PlaceResponse(val status: String, val places: List<Place>)

class Place(val name: String, val location: Location,
            @SerializedName("formatted_address") val address: String)

class Location(val lat: String, val lng: String)