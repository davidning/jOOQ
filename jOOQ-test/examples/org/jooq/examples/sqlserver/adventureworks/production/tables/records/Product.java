/**
 * This class is generated by jOOQ
 */
package org.jooq.examples.sqlserver.adventureworks.production.tables.records;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings("all")
@javax.persistence.Entity
@javax.persistence.Table(name = "Product", schema = "Production")
public class Product extends org.jooq.impl.UpdatableRecordImpl<org.jooq.examples.sqlserver.adventureworks.production.tables.records.Product> {

	private static final long serialVersionUID = -846704749;

	/**
	 * Setter for <code>Production.Product.ProductID</code>. 
	 */
	public void setProductID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductID, value);
	}

	/**
	 * Getter for <code>Production.Product.ProductID</code>. 
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "ProductID", unique = true, nullable = false, precision = 10)
	public java.lang.Integer getProductID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductID);
	}

	/**
	 * Setter for <code>Production.Product.Name</code>. 
	 */
	public void setName(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Name, value);
	}

	/**
	 * Getter for <code>Production.Product.Name</code>. 
	 */
	@javax.persistence.Column(name = "Name", nullable = false, length = 50)
	public java.lang.String getName() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Name);
	}

	/**
	 * Setter for <code>Production.Product.ProductNumber</code>. 
	 */
	public void setProductNumber(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductNumber, value);
	}

	/**
	 * Getter for <code>Production.Product.ProductNumber</code>. 
	 */
	@javax.persistence.Column(name = "ProductNumber", nullable = false, length = 25)
	public java.lang.String getProductNumber() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductNumber);
	}

	/**
	 * Setter for <code>Production.Product.MakeFlag</code>. 
	 */
	public void setMakeFlag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.MakeFlag, value);
	}

	/**
	 * Getter for <code>Production.Product.MakeFlag</code>. 
	 */
	@javax.persistence.Column(name = "MakeFlag", nullable = false)
	public java.lang.Boolean getMakeFlag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.MakeFlag);
	}

	/**
	 * Setter for <code>Production.Product.FinishedGoodsFlag</code>. 
	 */
	public void setFinishedGoodsFlag(java.lang.Boolean value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.FinishedGoodsFlag, value);
	}

	/**
	 * Getter for <code>Production.Product.FinishedGoodsFlag</code>. 
	 */
	@javax.persistence.Column(name = "FinishedGoodsFlag", nullable = false)
	public java.lang.Boolean getFinishedGoodsFlag() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.FinishedGoodsFlag);
	}

	/**
	 * Setter for <code>Production.Product.Color</code>. 
	 */
	public void setColor(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Color, value);
	}

	/**
	 * Getter for <code>Production.Product.Color</code>. 
	 */
	@javax.persistence.Column(name = "Color", length = 15)
	public java.lang.String getColor() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Color);
	}

	/**
	 * Setter for <code>Production.Product.SafetyStockLevel</code>. 
	 */
	public void setSafetyStockLevel(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SafetyStockLevel, value);
	}

	/**
	 * Getter for <code>Production.Product.SafetyStockLevel</code>. 
	 */
	@javax.persistence.Column(name = "SafetyStockLevel", nullable = false, precision = 5)
	public java.lang.Short getSafetyStockLevel() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SafetyStockLevel);
	}

	/**
	 * Setter for <code>Production.Product.ReorderPoint</code>. 
	 */
	public void setReorderPoint(java.lang.Short value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ReorderPoint, value);
	}

	/**
	 * Getter for <code>Production.Product.ReorderPoint</code>. 
	 */
	@javax.persistence.Column(name = "ReorderPoint", nullable = false, precision = 5)
	public java.lang.Short getReorderPoint() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ReorderPoint);
	}

	/**
	 * Setter for <code>Production.Product.StandardCost</code>. 
	 */
	public void setStandardCost(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.StandardCost, value);
	}

	/**
	 * Getter for <code>Production.Product.StandardCost</code>. 
	 */
	@javax.persistence.Column(name = "StandardCost", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getStandardCost() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.StandardCost);
	}

	/**
	 * Setter for <code>Production.Product.ListPrice</code>. 
	 */
	public void setListPrice(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ListPrice, value);
	}

	/**
	 * Getter for <code>Production.Product.ListPrice</code>. 
	 */
	@javax.persistence.Column(name = "ListPrice", nullable = false, precision = 19, scale = 4)
	public java.math.BigDecimal getListPrice() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ListPrice);
	}

	/**
	 * Setter for <code>Production.Product.Size</code>. 
	 */
	public void setSize(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Size, value);
	}

	/**
	 * Getter for <code>Production.Product.Size</code>. 
	 */
	@javax.persistence.Column(name = "Size", length = 5)
	public java.lang.String getSize() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Size);
	}

	/**
	 * Setter for <code>Production.Product.SizeUnitMeasureCode</code>. 
	 */
	public void setSizeUnitMeasureCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SizeUnitMeasureCode, value);
	}

	/**
	 * Getter for <code>Production.Product.SizeUnitMeasureCode</code>. 
	 */
	@javax.persistence.Column(name = "SizeUnitMeasureCode", length = 3)
	public java.lang.String getSizeUnitMeasureCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SizeUnitMeasureCode);
	}

	/**
	 * Setter for <code>Production.Product.WeightUnitMeasureCode</code>. 
	 */
	public void setWeightUnitMeasureCode(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.WeightUnitMeasureCode, value);
	}

	/**
	 * Getter for <code>Production.Product.WeightUnitMeasureCode</code>. 
	 */
	@javax.persistence.Column(name = "WeightUnitMeasureCode", length = 3)
	public java.lang.String getWeightUnitMeasureCode() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.WeightUnitMeasureCode);
	}

	/**
	 * Setter for <code>Production.Product.Weight</code>. 
	 */
	public void setWeight(java.math.BigDecimal value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Weight, value);
	}

	/**
	 * Getter for <code>Production.Product.Weight</code>. 
	 */
	@javax.persistence.Column(name = "Weight", precision = 8, scale = 2)
	public java.math.BigDecimal getWeight() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Weight);
	}

	/**
	 * Setter for <code>Production.Product.DaysToManufacture</code>. 
	 */
	public void setDaysToManufacture(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DaysToManufacture, value);
	}

	/**
	 * Getter for <code>Production.Product.DaysToManufacture</code>. 
	 */
	@javax.persistence.Column(name = "DaysToManufacture", nullable = false, precision = 10)
	public java.lang.Integer getDaysToManufacture() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DaysToManufacture);
	}

	/**
	 * Setter for <code>Production.Product.ProductLine</code>. 
	 */
	public void setProductLine(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductLine, value);
	}

	/**
	 * Getter for <code>Production.Product.ProductLine</code>. 
	 */
	@javax.persistence.Column(name = "ProductLine", length = 2)
	public java.lang.String getProductLine() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductLine);
	}

	/**
	 * Setter for <code>Production.Product.Class</code>. 
	 */
	public void setClass_(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Class, value);
	}

	/**
	 * Getter for <code>Production.Product.Class</code>. 
	 */
	@javax.persistence.Column(name = "Class", length = 2)
	public java.lang.String getClass_() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Class);
	}

	/**
	 * Setter for <code>Production.Product.Style</code>. 
	 */
	public void setStyle(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Style, value);
	}

	/**
	 * Getter for <code>Production.Product.Style</code>. 
	 */
	@javax.persistence.Column(name = "Style", length = 2)
	public java.lang.String getStyle() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.Style);
	}

	/**
	 * Setter for <code>Production.Product.ProductSubcategoryID</code>. 
	 */
	public void setProductSubcategoryID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductSubcategoryID, value);
	}

	/**
	 * Getter for <code>Production.Product.ProductSubcategoryID</code>. 
	 */
	@javax.persistence.Column(name = "ProductSubcategoryID", precision = 10)
	public java.lang.Integer getProductSubcategoryID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductSubcategoryID);
	}

	/**
	 * Setter for <code>Production.Product.ProductModelID</code>. 
	 */
	public void setProductModelID(java.lang.Integer value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductModelID, value);
	}

	/**
	 * Getter for <code>Production.Product.ProductModelID</code>. 
	 */
	@javax.persistence.Column(name = "ProductModelID", precision = 10)
	public java.lang.Integer getProductModelID() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ProductModelID);
	}

	/**
	 * Setter for <code>Production.Product.SellStartDate</code>. 
	 */
	public void setSellStartDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellStartDate, value);
	}

	/**
	 * Getter for <code>Production.Product.SellStartDate</code>. 
	 */
	@javax.persistence.Column(name = "SellStartDate", nullable = false)
	public java.sql.Timestamp getSellStartDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellStartDate);
	}

	/**
	 * Setter for <code>Production.Product.SellEndDate</code>. 
	 */
	public void setSellEndDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellEndDate, value);
	}

	/**
	 * Getter for <code>Production.Product.SellEndDate</code>. 
	 */
	@javax.persistence.Column(name = "SellEndDate")
	public java.sql.Timestamp getSellEndDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.SellEndDate);
	}

	/**
	 * Setter for <code>Production.Product.DiscontinuedDate</code>. 
	 */
	public void setDiscontinuedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DiscontinuedDate, value);
	}

	/**
	 * Getter for <code>Production.Product.DiscontinuedDate</code>. 
	 */
	@javax.persistence.Column(name = "DiscontinuedDate")
	public java.sql.Timestamp getDiscontinuedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.DiscontinuedDate);
	}

	/**
	 * Setter for <code>Production.Product.rowguid</code>. 
	 */
	public void setrowguid(java.lang.String value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.rowguid, value);
	}

	/**
	 * Getter for <code>Production.Product.rowguid</code>. 
	 */
	@javax.persistence.Column(name = "rowguid", nullable = false)
	public java.lang.String getrowguid() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.rowguid);
	}

	/**
	 * Setter for <code>Production.Product.ModifiedDate</code>. 
	 */
	public void setModifiedDate(java.sql.Timestamp value) {
		setValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ModifiedDate, value);
	}

	/**
	 * Getter for <code>Production.Product.ModifiedDate</code>. 
	 */
	@javax.persistence.Column(name = "ModifiedDate", nullable = false)
	public java.sql.Timestamp getModifiedDate() {
		return getValue(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product.ModifiedDate);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<java.lang.Integer> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached Product
	 */
	public Product() {
		super(org.jooq.examples.sqlserver.adventureworks.production.tables.Product.Product);
	}
}
