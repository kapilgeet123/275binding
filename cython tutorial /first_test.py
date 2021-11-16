import example_cy
import time

start_vanilla = time.time()
example_cy.prime_finder_van(5000)
end_vanilla = time.time()


print(end_vanilla - start_vanilla)

start_c = time.time()
example_cy.prime_finder_opt(5000)
end_c = time.time()

print(end_c - start_c)
