package interfaces;

import javax.persistence.EntityManager;

/**
 * Created by echerkas on 24.11.2015.
 */
public abstract class GenericDAOImpl<T> implements GenericDAOInterface {

    protected Class entityClass;
    protected EntityManager entityManager;

    public GenericDAOImpl(){
    }

    @Override
    public Object create(Object t) {
        entityManager.persist(t);
        return t;
    }

    @Override
    public Object update(Object t) {
        entityManager.merge(t);
        return t;
    }

    @Override
    public void remove(Object t) {
        t = entityManager.merge(t);
        entityManager.remove(t);
    }
//
//    @SuppressWarnings("unchecked")
//    public Object getById(Long id) {
//        return (T) entityManager.find(entityClass, id);
//    }
//
//    public List getAll() {
//        TypedQuery query = entityManager.createQuery("from " + entityClass.getName(), entityClass);
//        return query.getResultList();
//    }
}


//
//    public GenericDAOImpl() {
//        Type t = getClass().getGenericSuperclass();
//        ParameterizedType pt = (ParameterizedType) t;
//        entityClass = (Class) pt.getActualTypeArguments()[0];
//    }
//
//    public GenericDAOImpl(EntityManager entityManager) {
//        this.entityManager = entityManager;
//
//        @Override
//        public T create (T t){
//            entityManager.persist(t);
//            return t;
//        }
//
//        @Override
//        public T update (T t){
//            entityManager.merge(t);
//            return t;
//        }
//
//        @Override
//        public void remove (T t){
//            t = this.entityManager.merge(t);
//            this.entityManager.remove(t);
//        }
//
//        @Override
//        public T getById (Long id, Class xx){
//            return (T) entityManager.find(xx, id);
//        }
//
//        @Override
//        public List<T> getAll (Class xx){
//            TypedQuery<T> query = entityManager.createQuery("from " + xx.getName(), entityClass);
//            return query.getResultList();
//        }
//    }
//}
//
////        public GenericDaoImpl() {
////            ParameterizedType genericSuperclass = (ParameterizedType) getClass()
////                    .getGenericSuperclass();
////            this.entityClass = (Class) genericSuperclass
////                    .getActualTypeArguments()[0];
////        }
//
