package com.wpf.domain.cargo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShippingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andShippingOrderIdIsNull() {
            addCriterion("shipping_order_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdIsNotNull() {
            addCriterion("shipping_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdEqualTo(String value) {
            addCriterion("shipping_order_id =", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotEqualTo(String value) {
            addCriterion("shipping_order_id <>", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdGreaterThan(String value) {
            addCriterion("shipping_order_id >", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_order_id >=", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdLessThan(String value) {
            addCriterion("shipping_order_id <", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdLessThanOrEqualTo(String value) {
            addCriterion("shipping_order_id <=", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdLike(String value) {
            addCriterion("shipping_order_id like", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotLike(String value) {
            addCriterion("shipping_order_id not like", value, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdIn(List<String> values) {
            addCriterion("shipping_order_id in", values, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotIn(List<String> values) {
            addCriterion("shipping_order_id not in", values, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdBetween(String value1, String value2) {
            addCriterion("shipping_order_id between", value1, value2, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andShippingOrderIdNotBetween(String value1, String value2) {
            addCriterion("shipping_order_id not between", value1, value2, "shippingOrderId");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(String value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(String value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(String value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(String value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(String value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(String value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLike(String value) {
            addCriterion("order_type like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotLike(String value) {
            addCriterion("order_type not like", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<String> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<String> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(String value1, String value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(String value1, String value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andShipperIsNull() {
            addCriterion("shipper is null");
            return (Criteria) this;
        }

        public Criteria andShipperIsNotNull() {
            addCriterion("shipper is not null");
            return (Criteria) this;
        }

        public Criteria andShipperEqualTo(String value) {
            addCriterion("shipper =", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotEqualTo(String value) {
            addCriterion("shipper <>", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperGreaterThan(String value) {
            addCriterion("shipper >", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperGreaterThanOrEqualTo(String value) {
            addCriterion("shipper >=", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperLessThan(String value) {
            addCriterion("shipper <", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperLessThanOrEqualTo(String value) {
            addCriterion("shipper <=", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperLike(String value) {
            addCriterion("shipper like", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotLike(String value) {
            addCriterion("shipper not like", value, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperIn(List<String> values) {
            addCriterion("shipper in", values, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotIn(List<String> values) {
            addCriterion("shipper not in", values, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperBetween(String value1, String value2) {
            addCriterion("shipper between", value1, value2, "shipper");
            return (Criteria) this;
        }

        public Criteria andShipperNotBetween(String value1, String value2) {
            addCriterion("shipper not between", value1, value2, "shipper");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNull() {
            addCriterion("consignee is null");
            return (Criteria) this;
        }

        public Criteria andConsigneeIsNotNull() {
            addCriterion("consignee is not null");
            return (Criteria) this;
        }

        public Criteria andConsigneeEqualTo(String value) {
            addCriterion("consignee =", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotEqualTo(String value) {
            addCriterion("consignee <>", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThan(String value) {
            addCriterion("consignee >", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeGreaterThanOrEqualTo(String value) {
            addCriterion("consignee >=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThan(String value) {
            addCriterion("consignee <", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLessThanOrEqualTo(String value) {
            addCriterion("consignee <=", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeLike(String value) {
            addCriterion("consignee like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotLike(String value) {
            addCriterion("consignee not like", value, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeIn(List<String> values) {
            addCriterion("consignee in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotIn(List<String> values) {
            addCriterion("consignee not in", values, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeBetween(String value1, String value2) {
            addCriterion("consignee between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andConsigneeNotBetween(String value1, String value2) {
            addCriterion("consignee not between", value1, value2, "consignee");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyIsNull() {
            addCriterion("notify_party is null");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyIsNotNull() {
            addCriterion("notify_party is not null");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyEqualTo(String value) {
            addCriterion("notify_party =", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyNotEqualTo(String value) {
            addCriterion("notify_party <>", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyGreaterThan(String value) {
            addCriterion("notify_party >", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyGreaterThanOrEqualTo(String value) {
            addCriterion("notify_party >=", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyLessThan(String value) {
            addCriterion("notify_party <", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyLessThanOrEqualTo(String value) {
            addCriterion("notify_party <=", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyLike(String value) {
            addCriterion("notify_party like", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyNotLike(String value) {
            addCriterion("notify_party not like", value, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyIn(List<String> values) {
            addCriterion("notify_party in", values, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyNotIn(List<String> values) {
            addCriterion("notify_party not in", values, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyBetween(String value1, String value2) {
            addCriterion("notify_party between", value1, value2, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andNotifyPartyNotBetween(String value1, String value2) {
            addCriterion("notify_party not between", value1, value2, "notifyParty");
            return (Criteria) this;
        }

        public Criteria andLcNoIsNull() {
            addCriterion("lc_no is null");
            return (Criteria) this;
        }

        public Criteria andLcNoIsNotNull() {
            addCriterion("lc_no is not null");
            return (Criteria) this;
        }

        public Criteria andLcNoEqualTo(String value) {
            addCriterion("lc_no =", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotEqualTo(String value) {
            addCriterion("lc_no <>", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoGreaterThan(String value) {
            addCriterion("lc_no >", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoGreaterThanOrEqualTo(String value) {
            addCriterion("lc_no >=", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoLessThan(String value) {
            addCriterion("lc_no <", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoLessThanOrEqualTo(String value) {
            addCriterion("lc_no <=", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoLike(String value) {
            addCriterion("lc_no like", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotLike(String value) {
            addCriterion("lc_no not like", value, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoIn(List<String> values) {
            addCriterion("lc_no in", values, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotIn(List<String> values) {
            addCriterion("lc_no not in", values, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoBetween(String value1, String value2) {
            addCriterion("lc_no between", value1, value2, "lcNo");
            return (Criteria) this;
        }

        public Criteria andLcNoNotBetween(String value1, String value2) {
            addCriterion("lc_no not between", value1, value2, "lcNo");
            return (Criteria) this;
        }

        public Criteria andMarksIsNull() {
            addCriterion("marks is null");
            return (Criteria) this;
        }

        public Criteria andMarksIsNotNull() {
            addCriterion("marks is not null");
            return (Criteria) this;
        }

        public Criteria andMarksEqualTo(String value) {
            addCriterion("marks =", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotEqualTo(String value) {
            addCriterion("marks <>", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThan(String value) {
            addCriterion("marks >", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksGreaterThanOrEqualTo(String value) {
            addCriterion("marks >=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThan(String value) {
            addCriterion("marks <", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLessThanOrEqualTo(String value) {
            addCriterion("marks <=", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksLike(String value) {
            addCriterion("marks like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotLike(String value) {
            addCriterion("marks not like", value, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksIn(List<String> values) {
            addCriterion("marks in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotIn(List<String> values) {
            addCriterion("marks not in", values, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksBetween(String value1, String value2) {
            addCriterion("marks between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andMarksNotBetween(String value1, String value2) {
            addCriterion("marks not between", value1, value2, "marks");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingIsNull() {
            addCriterion("port_of_landing is null");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingIsNotNull() {
            addCriterion("port_of_landing is not null");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingEqualTo(String value) {
            addCriterion("port_of_landing =", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingNotEqualTo(String value) {
            addCriterion("port_of_landing <>", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingGreaterThan(String value) {
            addCriterion("port_of_landing >", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingGreaterThanOrEqualTo(String value) {
            addCriterion("port_of_landing >=", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingLessThan(String value) {
            addCriterion("port_of_landing <", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingLessThanOrEqualTo(String value) {
            addCriterion("port_of_landing <=", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingLike(String value) {
            addCriterion("port_of_landing like", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingNotLike(String value) {
            addCriterion("port_of_landing not like", value, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingIn(List<String> values) {
            addCriterion("port_of_landing in", values, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingNotIn(List<String> values) {
            addCriterion("port_of_landing not in", values, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingBetween(String value1, String value2) {
            addCriterion("port_of_landing between", value1, value2, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfLandingNotBetween(String value1, String value2) {
            addCriterion("port_of_landing not between", value1, value2, "portOfLanding");
            return (Criteria) this;
        }

        public Criteria andPortOfTransIsNull() {
            addCriterion("port_of_trans is null");
            return (Criteria) this;
        }

        public Criteria andPortOfTransIsNotNull() {
            addCriterion("port_of_trans is not null");
            return (Criteria) this;
        }

        public Criteria andPortOfTransEqualTo(String value) {
            addCriterion("port_of_trans =", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransNotEqualTo(String value) {
            addCriterion("port_of_trans <>", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransGreaterThan(String value) {
            addCriterion("port_of_trans >", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransGreaterThanOrEqualTo(String value) {
            addCriterion("port_of_trans >=", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransLessThan(String value) {
            addCriterion("port_of_trans <", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransLessThanOrEqualTo(String value) {
            addCriterion("port_of_trans <=", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransLike(String value) {
            addCriterion("port_of_trans like", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransNotLike(String value) {
            addCriterion("port_of_trans not like", value, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransIn(List<String> values) {
            addCriterion("port_of_trans in", values, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransNotIn(List<String> values) {
            addCriterion("port_of_trans not in", values, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransBetween(String value1, String value2) {
            addCriterion("port_of_trans between", value1, value2, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfTransNotBetween(String value1, String value2) {
            addCriterion("port_of_trans not between", value1, value2, "portOfTrans");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeIsNull() {
            addCriterion("port_of_discharge is null");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeIsNotNull() {
            addCriterion("port_of_discharge is not null");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeEqualTo(String value) {
            addCriterion("port_of_discharge =", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeNotEqualTo(String value) {
            addCriterion("port_of_discharge <>", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeGreaterThan(String value) {
            addCriterion("port_of_discharge >", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeGreaterThanOrEqualTo(String value) {
            addCriterion("port_of_discharge >=", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeLessThan(String value) {
            addCriterion("port_of_discharge <", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeLessThanOrEqualTo(String value) {
            addCriterion("port_of_discharge <=", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeLike(String value) {
            addCriterion("port_of_discharge like", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeNotLike(String value) {
            addCriterion("port_of_discharge not like", value, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeIn(List<String> values) {
            addCriterion("port_of_discharge in", values, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeNotIn(List<String> values) {
            addCriterion("port_of_discharge not in", values, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeBetween(String value1, String value2) {
            addCriterion("port_of_discharge between", value1, value2, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andPortOfDischargeNotBetween(String value1, String value2) {
            addCriterion("port_of_discharge not between", value1, value2, "portOfDischarge");
            return (Criteria) this;
        }

        public Criteria andLoadingDateIsNull() {
            addCriterion("loading_date is null");
            return (Criteria) this;
        }

        public Criteria andLoadingDateIsNotNull() {
            addCriterion("loading_date is not null");
            return (Criteria) this;
        }

        public Criteria andLoadingDateEqualTo(Date value) {
            addCriterion("loading_date =", value, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateNotEqualTo(Date value) {
            addCriterion("loading_date <>", value, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateGreaterThan(Date value) {
            addCriterion("loading_date >", value, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateGreaterThanOrEqualTo(Date value) {
            addCriterion("loading_date >=", value, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateLessThan(Date value) {
            addCriterion("loading_date <", value, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateLessThanOrEqualTo(Date value) {
            addCriterion("loading_date <=", value, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateIn(List<Date> values) {
            addCriterion("loading_date in", values, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateNotIn(List<Date> values) {
            addCriterion("loading_date not in", values, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateBetween(Date value1, Date value2) {
            addCriterion("loading_date between", value1, value2, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLoadingDateNotBetween(Date value1, Date value2) {
            addCriterion("loading_date not between", value1, value2, "loadingDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNull() {
            addCriterion("limit_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitDateIsNotNull() {
            addCriterion("limit_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitDateEqualTo(Date value) {
            addCriterion("limit_date =", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotEqualTo(Date value) {
            addCriterion("limit_date <>", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThan(Date value) {
            addCriterion("limit_date >", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("limit_date >=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThan(Date value) {
            addCriterion("limit_date <", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateLessThanOrEqualTo(Date value) {
            addCriterion("limit_date <=", value, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateIn(List<Date> values) {
            addCriterion("limit_date in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotIn(List<Date> values) {
            addCriterion("limit_date not in", values, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateBetween(Date value1, Date value2) {
            addCriterion("limit_date between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andLimitDateNotBetween(Date value1, Date value2) {
            addCriterion("limit_date not between", value1, value2, "limitDate");
            return (Criteria) this;
        }

        public Criteria andIsBatchIsNull() {
            addCriterion("is_batch is null");
            return (Criteria) this;
        }

        public Criteria andIsBatchIsNotNull() {
            addCriterion("is_batch is not null");
            return (Criteria) this;
        }

        public Criteria andIsBatchEqualTo(String value) {
            addCriterion("is_batch =", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotEqualTo(String value) {
            addCriterion("is_batch <>", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchGreaterThan(String value) {
            addCriterion("is_batch >", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchGreaterThanOrEqualTo(String value) {
            addCriterion("is_batch >=", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLessThan(String value) {
            addCriterion("is_batch <", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLessThanOrEqualTo(String value) {
            addCriterion("is_batch <=", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchLike(String value) {
            addCriterion("is_batch like", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotLike(String value) {
            addCriterion("is_batch not like", value, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchIn(List<String> values) {
            addCriterion("is_batch in", values, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotIn(List<String> values) {
            addCriterion("is_batch not in", values, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchBetween(String value1, String value2) {
            addCriterion("is_batch between", value1, value2, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsBatchNotBetween(String value1, String value2) {
            addCriterion("is_batch not between", value1, value2, "isBatch");
            return (Criteria) this;
        }

        public Criteria andIsTransIsNull() {
            addCriterion("is_trans is null");
            return (Criteria) this;
        }

        public Criteria andIsTransIsNotNull() {
            addCriterion("is_trans is not null");
            return (Criteria) this;
        }

        public Criteria andIsTransEqualTo(String value) {
            addCriterion("is_trans =", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotEqualTo(String value) {
            addCriterion("is_trans <>", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransGreaterThan(String value) {
            addCriterion("is_trans >", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransGreaterThanOrEqualTo(String value) {
            addCriterion("is_trans >=", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransLessThan(String value) {
            addCriterion("is_trans <", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransLessThanOrEqualTo(String value) {
            addCriterion("is_trans <=", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransLike(String value) {
            addCriterion("is_trans like", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotLike(String value) {
            addCriterion("is_trans not like", value, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransIn(List<String> values) {
            addCriterion("is_trans in", values, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotIn(List<String> values) {
            addCriterion("is_trans not in", values, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransBetween(String value1, String value2) {
            addCriterion("is_trans between", value1, value2, "isTrans");
            return (Criteria) this;
        }

        public Criteria andIsTransNotBetween(String value1, String value2) {
            addCriterion("is_trans not between", value1, value2, "isTrans");
            return (Criteria) this;
        }

        public Criteria andCopyNumIsNull() {
            addCriterion("copy_num is null");
            return (Criteria) this;
        }

        public Criteria andCopyNumIsNotNull() {
            addCriterion("copy_num is not null");
            return (Criteria) this;
        }

        public Criteria andCopyNumEqualTo(String value) {
            addCriterion("copy_num =", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumNotEqualTo(String value) {
            addCriterion("copy_num <>", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumGreaterThan(String value) {
            addCriterion("copy_num >", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumGreaterThanOrEqualTo(String value) {
            addCriterion("copy_num >=", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumLessThan(String value) {
            addCriterion("copy_num <", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumLessThanOrEqualTo(String value) {
            addCriterion("copy_num <=", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumLike(String value) {
            addCriterion("copy_num like", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumNotLike(String value) {
            addCriterion("copy_num not like", value, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumIn(List<String> values) {
            addCriterion("copy_num in", values, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumNotIn(List<String> values) {
            addCriterion("copy_num not in", values, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumBetween(String value1, String value2) {
            addCriterion("copy_num between", value1, value2, "copyNum");
            return (Criteria) this;
        }

        public Criteria andCopyNumNotBetween(String value1, String value2) {
            addCriterion("copy_num not between", value1, value2, "copyNum");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionIsNull() {
            addCriterion("special_condition is null");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionIsNotNull() {
            addCriterion("special_condition is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionEqualTo(String value) {
            addCriterion("special_condition =", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionNotEqualTo(String value) {
            addCriterion("special_condition <>", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionGreaterThan(String value) {
            addCriterion("special_condition >", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionGreaterThanOrEqualTo(String value) {
            addCriterion("special_condition >=", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionLessThan(String value) {
            addCriterion("special_condition <", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionLessThanOrEqualTo(String value) {
            addCriterion("special_condition <=", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionLike(String value) {
            addCriterion("special_condition like", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionNotLike(String value) {
            addCriterion("special_condition not like", value, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionIn(List<String> values) {
            addCriterion("special_condition in", values, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionNotIn(List<String> values) {
            addCriterion("special_condition not in", values, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionBetween(String value1, String value2) {
            addCriterion("special_condition between", value1, value2, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andSpecialConditionNotBetween(String value1, String value2) {
            addCriterion("special_condition not between", value1, value2, "specialCondition");
            return (Criteria) this;
        }

        public Criteria andFreightIsNull() {
            addCriterion("freight is null");
            return (Criteria) this;
        }

        public Criteria andFreightIsNotNull() {
            addCriterion("freight is not null");
            return (Criteria) this;
        }

        public Criteria andFreightEqualTo(Double value) {
            addCriterion("freight =", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotEqualTo(Double value) {
            addCriterion("freight <>", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThan(Double value) {
            addCriterion("freight >", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightGreaterThanOrEqualTo(Double value) {
            addCriterion("freight >=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThan(Double value) {
            addCriterion("freight <", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLessThanOrEqualTo(Double value) {
            addCriterion("freight <=", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightLike(Double value) {
            addCriterion("freight like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotLike(Double value) {
            addCriterion("freight not like", value, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightIn(List<Double> values) {
            addCriterion("freight in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotIn(List<Double> values) {
            addCriterion("freight not in", values, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightBetween(Double value1, Double value2) {
            addCriterion("freight between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andFreightNotBetween(Double value1, Double value2) {
            addCriterion("freight not between", value1, value2, "freight");
            return (Criteria) this;
        }

        public Criteria andCheckByIsNull() {
            addCriterion("check_by is null");
            return (Criteria) this;
        }

        public Criteria andCheckByIsNotNull() {
            addCriterion("check_by is not null");
            return (Criteria) this;
        }

        public Criteria andCheckByEqualTo(String value) {
            addCriterion("check_by =", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotEqualTo(String value) {
            addCriterion("check_by <>", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByGreaterThan(String value) {
            addCriterion("check_by >", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByGreaterThanOrEqualTo(String value) {
            addCriterion("check_by >=", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByLessThan(String value) {
            addCriterion("check_by <", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByLessThanOrEqualTo(String value) {
            addCriterion("check_by <=", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByLike(String value) {
            addCriterion("check_by like", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotLike(String value) {
            addCriterion("check_by not like", value, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByIn(List<String> values) {
            addCriterion("check_by in", values, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotIn(List<String> values) {
            addCriterion("check_by not in", values, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByBetween(String value1, String value2) {
            addCriterion("check_by between", value1, value2, "checkBy");
            return (Criteria) this;
        }

        public Criteria andCheckByNotBetween(String value1, String value2) {
            addCriterion("check_by not between", value1, value2, "checkBy");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateEdptIsNull() {
            addCriterion("create_edpt is null");
            return (Criteria) this;
        }

        public Criteria andCreateEdptIsNotNull() {
            addCriterion("create_edpt is not null");
            return (Criteria) this;
        }

        public Criteria andCreateEdptEqualTo(String value) {
            addCriterion("create_edpt =", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptNotEqualTo(String value) {
            addCriterion("create_edpt <>", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptGreaterThan(String value) {
            addCriterion("create_edpt >", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptGreaterThanOrEqualTo(String value) {
            addCriterion("create_edpt >=", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptLessThan(String value) {
            addCriterion("create_edpt <", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptLessThanOrEqualTo(String value) {
            addCriterion("create_edpt <=", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptLike(String value) {
            addCriterion("create_edpt like", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptNotLike(String value) {
            addCriterion("create_edpt not like", value, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptIn(List<String> values) {
            addCriterion("create_edpt in", values, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptNotIn(List<String> values) {
            addCriterion("create_edpt not in", values, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptBetween(String value1, String value2) {
            addCriterion("create_edpt between", value1, value2, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateEdptNotBetween(String value1, String value2) {
            addCriterion("create_edpt not between", value1, value2, "createEdpt");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}