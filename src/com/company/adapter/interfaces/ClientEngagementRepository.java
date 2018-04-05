package com.company.adapter.interfaces;



/**
 * Created by mihailkopchev on 4/5/18.
 */
public interface ClientEngagementRepository {


    void add(ClientEngagement clientEngagement);

    void remove(ClientEngagement clientEngagement);

    Iterable<ClientEngagement> findByClient(String client);

    Iterable<ClientEngagement> findWithAtLeastHourWorked(final int hour);

    Iterable<ClientEngagement> find(Query query);

}
