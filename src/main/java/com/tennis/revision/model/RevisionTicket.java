package com.tennis.revision.model;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "revision_tickets")
public class RevisionTicket {
    private int id;
    private int clients_id;
    private String product_name;
    private String product_description;
    private String initial_description;
    private Timestamp initial_date;
    private String mid_status;
    private Timestamp final_date;
    private String final_status;
    private String final_description;
    private boolean receive_status;
    private Timestamp date_receive;

    public RevisionTicket() {
    }

    public RevisionTicket(int id, int clients_id, String product_name, String product_description, String initial_description, Timestamp initial_date, String mid_status, Timestamp final_date, String final_status, String final_description, boolean receive_status, Timestamp date_receive) {
        this.id = id;
        this.clients_id = clients_id;
        this.product_name = product_name;
        this.product_description = product_description;
        this.initial_description = initial_description;
        this.initial_date = initial_date;
        this.mid_status = mid_status;
        this.final_date = final_date;
        this.final_status = final_status;
        this.final_description = final_description;
        this.receive_status = receive_status;
        this.date_receive = date_receive;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClients_id() {
        return clients_id;
    }

    public void setClients_id(int clients_id) {
        this.clients_id = clients_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public String getInitial_description() {
        return initial_description;
    }

    public void setInitial_description(String initial_description) {
        this.initial_description = initial_description;
    }

    public Timestamp getInitial_date() {
        return initial_date;
    }

    public void setInitial_date(Timestamp initial_date) {
        this.initial_date = initial_date;
    }

    public String getMid_status() {
        return mid_status;
    }

    public void setMid_status(String mid_status) {
        this.mid_status = mid_status;
    }

    public Timestamp getFinal_date() {
        return final_date;
    }

    public void setFinal_date(Timestamp final_date) {
        this.final_date = final_date;
    }

    public String getFinal_status() {
        return final_status;
    }

    public void setFinal_status(String final_status) {
        this.final_status = final_status;
    }

    public String getFinal_description() {
        return final_description;
    }

    public void setFinal_description(String final_description) {
        this.final_description = final_description;
    }

    public boolean isReceive_status() {
        return receive_status;
    }

    public void setReceive_status(boolean receive_status) {
        this.receive_status = receive_status;
    }

    public Timestamp getDate_receive() {
        return date_receive;
    }

    public void setDate_receive(Timestamp date_receive) {
        this.date_receive = date_receive;
    }

}
