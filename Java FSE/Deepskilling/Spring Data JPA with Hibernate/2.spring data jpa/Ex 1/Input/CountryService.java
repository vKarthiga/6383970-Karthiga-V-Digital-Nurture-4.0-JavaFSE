@Transactional
public List<Country> findByNameContaining(String keyword) {
    return countryRepository.findByNameContaining(keyword);
}

@Transactional
public List<Country> findByNameContainingSorted(String keyword) {
    return countryRepository.findByNameContainingOrderByNameAsc(keyword);
}

@Transactional
public List<Country> findByNameStartingWith(String letter) {
    return countryRepository.findByNameStartingWith(letter);
}
