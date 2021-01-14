package X;

import android.location.Location;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.1N1  reason: invalid class name */
public class AnonymousClass1N1 implements Serializable {
    public static final long serialVersionUID = 1;
    public transient Location A00;
    public boolean hasMoreResults;
    public String htmlAttributions;
    public final double lat;
    public String locationNextPageToken;
    public final double lon;
    public final ArrayList places;
    public final String query;
    public final int radius;
    public String requestId;
    public int requestIndex;
    public boolean responseCached;
    public Integer responseCode;
    public String responseCodeDescr;
    public long responseTime;
    public String sessionId;
    public final int source;

    public AnonymousClass1N1() {
        this.places = new ArrayList();
        this.hasMoreResults = false;
        this.locationNextPageToken = null;
        this.source = 0;
        this.lat = Double.MAX_VALUE;
        this.lon = Double.MAX_VALUE;
        this.radius = 0;
        this.query = "";
        this.hasMoreResults = false;
        this.locationNextPageToken = null;
    }

    public AnonymousClass1N1(int i, Location location, int i2, String str) {
        this.places = new ArrayList();
        this.hasMoreResults = false;
        this.locationNextPageToken = null;
        this.source = i;
        this.lat = location.getLatitude();
        this.lon = location.getLongitude();
        this.radius = i2;
        this.query = str == null ? "" : str;
        this.hasMoreResults = false;
        this.locationNextPageToken = null;
    }

    public Location A00() {
        if (this.lat == Double.MAX_VALUE || this.lon == Double.MAX_VALUE) {
            return null;
        }
        if (this.A00 == null) {
            Location location = new Location("");
            this.A00 = location;
            location.setLatitude(this.lat);
            this.A00.setLongitude(this.lon);
        }
        return this.A00;
    }
}
