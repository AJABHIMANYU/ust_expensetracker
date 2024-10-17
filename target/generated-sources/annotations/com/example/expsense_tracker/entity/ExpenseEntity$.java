package com.example.expsense_tracker.entity;

import com.speedment.jpastreamer.field.BooleanField;
import com.speedment.jpastreamer.field.ComparableField;
import com.speedment.jpastreamer.field.DoubleField;
import com.speedment.jpastreamer.field.LongField;
import com.speedment.jpastreamer.field.StringField;

import java.time.LocalDate;

/**
 * The generated base for entity {@link ExpenseEntity} representing entities of
 * the {@code expenseEntity}-table in the database.
 * <p> This file has been automatically generated by JPAStreamer.
 * 
 * @author JPAStreamer
 */
public final class ExpenseEntity$ {
    
    /**
     * This Field corresponds to the {@link ExpenseEntity} field "date".
     */
    public static final ComparableField<ExpenseEntity, LocalDate> date = ComparableField.create(
        ExpenseEntity.class,
        "date",
        ExpenseEntity::getDate,
        false
    );
    /**
     * This Field corresponds to the {@link ExpenseEntity} field "id".
     */
    public static final LongField<ExpenseEntity> id = LongField.create(
        ExpenseEntity.class,
        "id",
        ExpenseEntity::getId,
        false
    );
    /**
     * This Field corresponds to the {@link ExpenseEntity} field "description".
     */
    public static final StringField<ExpenseEntity> description = StringField.create(
        ExpenseEntity.class,
        "description",
        ExpenseEntity::getDescription,
        false
    );
    /**
     * This Field corresponds to the {@link ExpenseEntity} field
     * "paymentMethod".
     */
    public static final StringField<ExpenseEntity> paymentMethod = StringField.create(
        ExpenseEntity.class,
        "paymentMethod",
        ExpenseEntity::getPaymentMethod,
        false
    );
    /**
     * This Field corresponds to the {@link ExpenseEntity} field "amount".
     */
    public static final DoubleField<ExpenseEntity> amount = DoubleField.create(
        ExpenseEntity.class,
        "amount",
        ExpenseEntity::getAmount,
        false
    );
    /**
     * This Field corresponds to the {@link ExpenseEntity} field "income".
     */
    public static final BooleanField<ExpenseEntity> income = BooleanField.create(
        ExpenseEntity.class,
        "income",
        ExpenseEntity::isIncome,
        false
    );
}