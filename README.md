Fault Tolerance: A technique that allows the microservices to continue to operate when a failure or error happens. Implementing fault tolerance can be achieved within the Spring Boot by using the Resilience4J library

Circuit breaker: It monitors the failures and stops requests to a failing service when a threshold is reached. This would give the service some time to recover.

Retry: Automatically retries the request after some delay if it fails. That's helpful for transient failures, for example, those caused by temporary network problems.

Bulkhead: Limits the number of open calls to a protected service from the same time.

Rate limiter: Prevents the number of allowed accepted traffics to a protected service.
