@Transactional
public void updateCountry(String code, String name) throws CountryNotFoundException {
    Optional<Country> result = countryRepository.findById(code);
    if (!result.isPresent()) {
        throw new CountryNotFoundException("Country with code " + code + " not found");
    }

    Country country = result.get();
    country.setName(name);

    countryRepository.save(country); // Saves the updated country name
}
