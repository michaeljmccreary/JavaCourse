public class PaintJob {
    public static void main(String[] args) {

    }
        // Method with just area and areaPerBucket parameters
        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) {
                return -1; // Return -1 for invalid input
            }

            // Calculate the number of buckets needed for the given area
            double requiredBuckets = area / areaPerBucket;

            // Since we need whole buckets, mathematically rounding up is required
            return (int) Math.ceil(requiredBuckets);
        }

        // Overloaded method without the extraBuckets parameter
        public static int getBucketCount(double width, double height, double areaPerBucket) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1; // Return -1 for invalid input
            }

            double areaToPaint = width * height; // Calculate the total area to paint
            return getBucketCount(areaToPaint, areaPerBucket); // Reuse the method for consistency
        }

        // The original method with extraBuckets parameter
        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1; // Return -1 for invalid input
            }

            double areaToPaint = width * height;
            double requiredBuckets = areaToPaint / areaPerBucket;

            int bucketsToBuy = (int) Math.ceil(requiredBuckets) - extraBuckets;

            return bucketsToBuy > 0 ? bucketsToBuy : 0;
        }
}
