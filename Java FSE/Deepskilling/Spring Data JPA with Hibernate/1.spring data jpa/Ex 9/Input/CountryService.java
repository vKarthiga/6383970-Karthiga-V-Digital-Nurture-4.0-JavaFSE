@Transactional
public void deleteCountry(String code) {
    countryRepository.deleteById(code);
}
