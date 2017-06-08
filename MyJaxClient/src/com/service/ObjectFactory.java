package com.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.service package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _GetOne_QNAME = new QName("http://service.com/",
			"getOne");
	private final static QName _Confirm_QNAME = new QName(
			"http://service.com/", "confirm");
	private final static QName _GetCount_QNAME = new QName(
			"http://service.com/", "getCount");
	private final static QName _BuyResponse_QNAME = new QName(
			"http://service.com/", "buyResponse");
	private final static QName _GetDescriptionResponse_QNAME = new QName(
			"http://service.com/", "getDescriptionResponse");
	private final static QName _Add_QNAME = new QName("http://service.com/",
			"add");
	private final static QName _GetProductListResponse_QNAME = new QName(
			"http://service.com/", "getProductListResponse");
	private final static QName _GetPriceResponse_QNAME = new QName(
			"http://service.com/", "getPriceResponse");
	private final static QName _GetProductList_QNAME = new QName(
			"http://service.com/", "getProductList");
	private final static QName _AddResponse_QNAME = new QName(
			"http://service.com/", "addResponse");
	private final static QName _GetDescription_QNAME = new QName(
			"http://service.com/", "getDescription");
	private final static QName _Buy_QNAME = new QName("http://service.com/",
			"buy");
	private final static QName _ConfirmResponse_QNAME = new QName(
			"http://service.com/", "confirmResponse");
	private final static QName _GetCountResponse_QNAME = new QName(
			"http://service.com/", "getCountResponse");
	private final static QName _GetOneResponse_QNAME = new QName(
			"http://service.com/", "getOneResponse");
	private final static QName _GetPrice_QNAME = new QName(
			"http://service.com/", "getPrice");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.service
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link Confirm }
	 * 
	 */
	public Confirm createConfirm() {
		return new Confirm();
	}

	/**
	 * Create an instance of {@link GetCountResponse }
	 * 
	 */
	public GetCountResponse createGetCountResponse() {
		return new GetCountResponse();
	}

	/**
	 * Create an instance of {@link GetPriceResponse }
	 * 
	 */
	public GetPriceResponse createGetPriceResponse() {
		return new GetPriceResponse();
	}

	/**
	 * Create an instance of {@link GetOne }
	 * 
	 */
	public GetOne createGetOne() {
		return new GetOne();
	}

	/**
	 * Create an instance of {@link Buy }
	 * 
	 */
	public Buy createBuy() {
		return new Buy();
	}

	/**
	 * Create an instance of {@link GetOneResponse }
	 * 
	 */
	public GetOneResponse createGetOneResponse() {
		return new GetOneResponse();
	}

	/**
	 * Create an instance of {@link GetPrice }
	 * 
	 */
	public GetPrice createGetPrice() {
		return new GetPrice();
	}

	/**
	 * Create an instance of {@link GetDescriptionResponse }
	 * 
	 */
	public GetDescriptionResponse createGetDescriptionResponse() {
		return new GetDescriptionResponse();
	}

	/**
	 * Create an instance of {@link ConfirmResponse }
	 * 
	 */
	public ConfirmResponse createConfirmResponse() {
		return new ConfirmResponse();
	}

	/**
	 * Create an instance of {@link GetProductList }
	 * 
	 */
	public GetProductList createGetProductList() {
		return new GetProductList();
	}

	/**
	 * Create an instance of {@link BuyResponse }
	 * 
	 */
	public BuyResponse createBuyResponse() {
		return new BuyResponse();
	}

	/**
	 * Create an instance of {@link Add }
	 * 
	 */
	public Add createAdd() {
		return new Add();
	}

	/**
	 * Create an instance of {@link GetDescription }
	 * 
	 */
	public GetDescription createGetDescription() {
		return new GetDescription();
	}

	/**
	 * Create an instance of {@link GetProductListResponse }
	 * 
	 */
	public GetProductListResponse createGetProductListResponse() {
		return new GetProductListResponse();
	}

	/**
	 * Create an instance of {@link GetCount }
	 * 
	 */
	public GetCount createGetCount() {
		return new GetCount();
	}

	/**
	 * Create an instance of {@link AddResponse }
	 * 
	 */
	public AddResponse createAddResponse() {
		return new AddResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetOne }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getOne")
	public JAXBElement<GetOne> createGetOne(GetOne value) {
		return new JAXBElement<GetOne>(_GetOne_QNAME, GetOne.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Confirm }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "confirm")
	public JAXBElement<Confirm> createConfirm(Confirm value) {
		return new JAXBElement<Confirm>(_Confirm_QNAME, Confirm.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetCount }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getCount")
	public JAXBElement<GetCount> createGetCount(GetCount value) {
		return new JAXBElement<GetCount>(_GetCount_QNAME, GetCount.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link BuyResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "buyResponse")
	public JAXBElement<BuyResponse> createBuyResponse(BuyResponse value) {
		return new JAXBElement<BuyResponse>(_BuyResponse_QNAME,
				BuyResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDescriptionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getDescriptionResponse")
	public JAXBElement<GetDescriptionResponse> createGetDescriptionResponse(
			GetDescriptionResponse value) {
		return new JAXBElement<GetDescriptionResponse>(
				_GetDescriptionResponse_QNAME, GetDescriptionResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "add")
	public JAXBElement<Add> createAdd(Add value) {
		return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetProductListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getProductListResponse")
	public JAXBElement<GetProductListResponse> createGetProductListResponse(
			GetProductListResponse value) {
		return new JAXBElement<GetProductListResponse>(
				_GetProductListResponse_QNAME, GetProductListResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetPriceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getPriceResponse")
	public JAXBElement<GetPriceResponse> createGetPriceResponse(
			GetPriceResponse value) {
		return new JAXBElement<GetPriceResponse>(_GetPriceResponse_QNAME,
				GetPriceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetProductList }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getProductList")
	public JAXBElement<GetProductList> createGetProductList(GetProductList value) {
		return new JAXBElement<GetProductList>(_GetProductList_QNAME,
				GetProductList.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "addResponse")
	public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
		return new JAXBElement<AddResponse>(_AddResponse_QNAME,
				AddResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetDescription }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getDescription")
	public JAXBElement<GetDescription> createGetDescription(GetDescription value) {
		return new JAXBElement<GetDescription>(_GetDescription_QNAME,
				GetDescription.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Buy }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "buy")
	public JAXBElement<Buy> createBuy(Buy value) {
		return new JAXBElement<Buy>(_Buy_QNAME, Buy.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ConfirmResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "confirmResponse")
	public JAXBElement<ConfirmResponse> createConfirmResponse(
			ConfirmResponse value) {
		return new JAXBElement<ConfirmResponse>(_ConfirmResponse_QNAME,
				ConfirmResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetCountResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getCountResponse")
	public JAXBElement<GetCountResponse> createGetCountResponse(
			GetCountResponse value) {
		return new JAXBElement<GetCountResponse>(_GetCountResponse_QNAME,
				GetCountResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetOneResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getOneResponse")
	public JAXBElement<GetOneResponse> createGetOneResponse(GetOneResponse value) {
		return new JAXBElement<GetOneResponse>(_GetOneResponse_QNAME,
				GetOneResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetPrice }{@code
	 * >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://service.com/", name = "getPrice")
	public JAXBElement<GetPrice> createGetPrice(GetPrice value) {
		return new JAXBElement<GetPrice>(_GetPrice_QNAME, GetPrice.class, null,
				value);
	}

}
