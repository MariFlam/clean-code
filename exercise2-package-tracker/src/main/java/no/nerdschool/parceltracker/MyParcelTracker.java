package no.nerdschool.parceltracker;

import jdk.nashorn.internal.objects.Global;
import no.nerdschool.parceltracker.events.ParcelDelivered;
import no.nerdschool.parceltracker.events.ParcelRegistered;
import no.nerdschool.parceltracker.events.ParcelStatus;
import no.nerdschool.parceltracker.events.ParcelScanned;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class MyParcelTracker implements ParcelTracker {
    //keys are the package id's, the value is a PackageStatus object
    HashMap<String, ArrayList<ParcelStatus>> packageStatuses = new HashMap<String, ArrayList<ParcelStatus>>();

    @Override
    public String getParcelStatusForParcelId(String parcelId) {
        String status = "";
        ArrayList<ParcelStatus> statusObject = packageStatuses.get(parcelId);
        if (statusObject != null){
            if (statusObject instanceof ParcelScanned){
                if (((ParcelScanned) statusObject).getLocation() != statusObject.toLocation)
                {status = "Parcel last seen at "+ ((ParcelScanned) statusObject).getLocation();}
                if (((ParcelScanned) statusObject).getLocation()==statusObject.getToLocation);
            };
            if (statusObject instanceof ParcelRegistered) {
                status = "";

            };
            if (statusObject instanceof ParcelDelivered){

            }
            elseif {
                return "This package has not been registered, scanned or delivered";
            };
        }
        return status;
    }

    @Override
    public void handleNewParcelStatus(ParcelStatus parcelStatus) {
        String id = parcelStatus.getParcelId();


    }
}
