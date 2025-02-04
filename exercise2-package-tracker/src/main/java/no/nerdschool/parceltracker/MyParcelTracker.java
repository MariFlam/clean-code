package no.nerdschool.parceltracker;

import no.nerdschool.parceltracker.events.ParcelRegistered;
import no.nerdschool.parceltracker.events.ParcelScanned;
import no.nerdschool.parceltracker.events.ParcelStatus;

import java.util.ArrayList;
import java.util.HashMap;

public class MyParcelTracker implements ParcelTracker {
    //keys are the package id's, the value is a PackageStatus object
    HashMap<String, ArrayList<ParcelStatus>> parcelStatuses;
    public MyParcelTracker(){
        parcelStatuses = new HashMap<String, ArrayList<ParcelStatus>>();
    }

    @Override
    public String getParcelStatusForParcelId(String parcelId) {
    ArrayList statusList = parcelStatuses.get(parcelId);
        if (statusList == null || statusList.size() == 0){
            return "This is not the parcel you are looking for";
        }


    return status;
    }

    @Override
    public void handleNewParcelStatus(ParcelStatus parcelStatus) {
        String parcelId = parcelStatus.getParcelId();
        ArrayList statusList = parcelStatuses.get(parcelId);
        if(statusList==null){
            ArrayList newlist = new ArrayList<ParcelStatus>();
            newlist.add(parcelStatus);
            parcelStatuses.put(parcelId, newlist);
            return;
        }
        statusList.add(parcelStatus);
    }
    public int getNumberOfParcelEvents(String parcelId){
        ArrayList statusList = parcelStatuses.getOrDefault(parcelId, new ArrayList<>());
        return statusList.size();
    }

    public ParcelStatus findStatusObject(ParcelStatus status, ArrayList statusList){
        if (statusList.size()==1& statusList.get(0) instanceof ParcelScanned){

        }
        for (Object item : statusList) {
            if (item instanceof ParcelStatus) {




                return null;
            }
        }

    }


}
