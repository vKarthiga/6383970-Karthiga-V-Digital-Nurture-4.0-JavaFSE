@Repository
public class ProductRepositoryImpl implements ProductRepositoryCustom {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> searchProducts(ProductSearchCriteria criteria) {
        CriteriaBuilder cb = entityManager.getCriteriaBuilder();
        CriteriaQuery<Product> cq = cb.createQuery(Product.class);
        Root<Product> product = cq.from(Product.class);

        List<Predicate> predicates = new ArrayList<>();

        if (criteria.getMinCpuSpeed() != null) {
            predicates.add(cb.greaterThanOrEqualTo(product.get("cpuSpeed"), criteria.getMinCpuSpeed()));
        }

        if (criteria.getMaxWeight() != null) {
            predicates.add(cb.lessThanOrEqualTo(product.get("weight"), criteria.getMaxWeight()));
        }

        if (criteria.getMinRamSize() != null) {
            predicates.add(cb.greaterThanOrEqualTo(product.get("ramSize"), criteria.getMinRamSize()));
        }

        if (criteria.getOs() != null && !criteria.getOs().isEmpty()) {
            predicates.add(cb.equal(product.get("os"), criteria.getOs()));
        }

        if (criteria.getMinCustomerReview() != null) {
            predicates.add(cb.greaterThanOrEqualTo(product.get("customerReview"), criteria.getMinCustomerReview()));
        }

        cq.select(product).where(predicates.toArray(new Predicate[0]));

        return entityManager.createQuery(cq).getResultList();
    }
}
